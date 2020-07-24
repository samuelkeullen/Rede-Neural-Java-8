package samuelkeullen.miraikeullen.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;



public class Driver {
	
	
	static int NUMB_OF_EPOCHS = 10001; //a quantidade de treinos
	static double TRAINING_DATA[][][] = new double[][][] {{{1,0,0},{0}},
	                                                      {{1,0,1},{1}},
	                                                      {{1,1,0},{1}},
	                                                      {{1,1,1},{0}}};
	
	
  public static void Main(String[] args) throws IOException{
    	BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
    	System.out.println("> Por favor entre # de neur�nios na camada oculta");
		MiraiNeuralNetwork miraiNeuralNetwork = new MiraiNeuralNetwork(Integer.parseInt(bufferedReader.readLine()));
    	boolean flag = true;
    	while (flag){
    		System.out.println(">O que voc� quer fazer papai (me treinar, ver minha taxa de aprendizado, sair) ?");
    		String command = bufferedReader.readLine();
    		switch (command) {
    		case "ver minha taxa de aprendizado":
    			double[] result = new double[ Driver.TRAINING_DATA.length];
    			IntStream.range(0, Driver.TRAINING_DATA.length).forEach(i -> 
    				result[i] = miraiNeuralNetwork.forwardprop(Driver.TRAINING_DATA[i][0])
    						                       .getLayers()[2].getNeurons()[0].getOutput());
    			printResult(result);
    			break;
    		case "me treinar":
    			IntStream.range(0, NUMB_OF_EPOCHS).forEach(i -> {
    				System.out.println("[�poca "+i+"]");
    				IntStream.range(0, TRAINING_DATA.length).forEach(j ->
    				   System.out.println(miraiNeuralNetwork.forwardprop(Driver.TRAINING_DATA[j][0])
    						                                 .backpropError(Driver.TRAINING_DATA[j][1][0])));
    		});
    			System.out.println("[treinamento completo!]");
    			break;
    		case "sair":
    			flag = false;
    			break;
    	}
    }
    	System.exit(0);
}
  
  static void printResult(double[] result) {
	 IntStream.range(0, TRAINING_DATA[0][0].length).forEach(x -> System.out.print("  Entrada "+x+" |"));
	 System.out.println(" Resultado Alvo | Resultado   ");
	 IntStream.range(0, TRAINING_DATA[0][0].length).forEach(x -> System.out.print("---------------"));
	 System.out.println("---------------------------");
	 IntStream.range(0, TRAINING_DATA.length).forEach(i -> {
		 IntStream.range(0, TRAINING_DATA[0][0].length).forEach(j -> System.out.print("    "+TRAINING_DATA[i][0][j] + "   |"));
		 System.out.print("     "+TRAINING_DATA[i][1][0] + "     |  " + String.format("%.5f", result[i]) + "  \n");
	 });
  }
}
