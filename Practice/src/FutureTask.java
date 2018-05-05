import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FutureTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Executor executor = Executors.newFixedThreadPool(10);
		// TODO Auto-generated method stub
	List<String> alist1 = new ArrayList<String>();
		System.out.println(" Hello");
		// Using Lambda Expression
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
		    // Simulate a long-running Job   
		    try {
		       // Thread.sleep(1000);
		    	TimeUnit.SECONDS.sleep(2);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
		    System.out.println("I'll run in a separate thread than the main thread.");
		});

		future.get();
		
		// Run a task specified by a Supplier object asynchronously
		CompletableFuture<List<String>> future1 = CompletableFuture.supplyAsync(new Supplier<List<String>>() {
		    @Override
		    public List<String> get() {
		    	List<String> alist = Arrays.asList("Vikas","Vishal","Ajay","Siddesh","Krish","Viajy");
		    	List<String> newlist = alist.stream().filter(t-> t.startsWith("V")).collect(Collectors.toList());
		    	
		    	
		        try {
		            TimeUnit.SECONDS.sleep(5);
		        } catch (InterruptedException e) {
		            throw new IllegalStateException(e);
		        }
		        return newlist;
		    }
		},executor);
		System.out.println(" is future task Completed ? " + future1.isDone());
		// Block and get the result of the Future
		alist1  = future1.get();
		alist1.forEach(System.out::println);
		
		
		Thread t1 = new Thread(new Runnable () {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(" Hello i am here ");
			}
			
		});
		t1.start();
	}

	
}
