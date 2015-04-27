package br.ufpe.cin.perfbook.counter.exercise;

// Statistical Counters � atualizada muito frequentemente, e o valor � lido nunca ou raramente.
public class StatisticalCounterMain {

	  public static void main(String[] args) {
		  
		  StatisticalCounter counter = new StatisticalCounter();
		  
		  // create the thread that will be responsible to read the counter
		  Thread readerThread = new Thread(new StatisticalReaderRunnable(counter));
		  readerThread.start();
		  
		  counter.start();
	    }	
}