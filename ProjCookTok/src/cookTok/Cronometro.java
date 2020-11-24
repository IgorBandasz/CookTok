package cookTok;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.Tela_Exec;
public class Cronometro {
	public static int segundos;
	private AtualizaLabel myThread;
	private Thread thread;
	public Cronometro() {
		initComponents();
	}
	private void initComponents() {
                Tela_Exec.lbTempo.setText("00:00:00");
		Tela_Exec.btStart.addActionListener(new StartListener());
		Tela_Exec.btPause.addActionListener(new PauseListener());
		Tela_Exec.btStop.addActionListener(new StopListener());
	}
	private void segundos() {
		segundos--;
        }
	private String tempoFormatado() {   
		segundos();
		int segundo = (segundos % 60);
		int minuto = ((segundos % 3600) / 60);
		int hora = (segundos / 3600);
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
	private class AtualizaLabel implements Runnable {
		private boolean begin;
		private boolean stop;
		private boolean paused;
		public AtualizaLabel() {
			beginThread(true);
			stopThread(false);
			pausedThread(false);
		}
		private void beginThread(boolean begin) {
			this.begin = begin;
		}
		private boolean isBeginThread() {
			return begin;
		}
		private void stopThread(boolean stop) {
			this.stop = stop;
		}
		private boolean isStopThread() {
			return stop;
		}
		private void pausedThread(boolean paused) {
			this.paused = paused;
		}
		private boolean isPausedThread() {
			return paused;
		}
		@Override
		public void run() {
			while (!isStopThread()) {
				if (!isPausedThread()) {
					if (!isBeginThread()) {
                                            if (segundos != 00){                                   
                                                Tela_Exec.lbTempo.setText(tempoFormatado());
                                            } else {
                                                Tela_Exec.lbTempo.setText("Acabou!!"); 
                                                Tela_Exec.btStart.setText("Reiniciar");
                                                thread = null;
                                                myThread.stopThread(true);
                                            }
					} else {
						beginThread(false);
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			segundos = Tela_Exec.tempo;
                    }       
	}
	private class StartListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (thread == null) {
                                // segundos = 3;
				myThread = new AtualizaLabel();
				thread = new Thread(myThread);
				thread.start();
			}
			Tela_Exec.btStart.setText("Start");
			myThread.pausedThread(false);
		}
	}
	private class PauseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			myThread.pausedThread(true);
			if (!myThread.isStopThread()) {
				Tela_Exec.btStart.setText("Restart");
			}
		}
	}
	private class StopListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!myThread.isStopThread()) {
				thread = null;
				myThread.stopThread(true);
			}
			myThread.beginThread(true);
			Tela_Exec.btStart.setText("Start");
		}
	}
}