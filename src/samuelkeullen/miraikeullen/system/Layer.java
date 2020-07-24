package samuelkeullen.miraikeullen.system;

import java.util.stream.IntStream;

import samuelkeullen.miraikeullen.system.Layer.LayerType;

public class Layer {
	static enum LayerType {I, H, O};
    private MiraiNeuron[] miraiNeuron = null;
    private LayerType layerType;
    public Layer(MiraiNeuralNetwork miraiNeuralNetwork, LayerType layerType) {
    	this.layerType = layerType;
    	switch(layerType) {
    	case I:
    		miraiNeuron = new MiraiNeuron[MiraiNeuralNetwork.NUMB_OF_INPUT_NEURONS];
    		IntStream.range(0, MiraiNeuralNetwork.NUMB_OF_INPUT_NEURONS).forEach(i -> miraiNeuron[i] = new MiraiNeuron(layerType, 0));
    		break;
    	case H:
    		miraiNeuron = new MiraiNeuron[miraiNeuralNetwork.getNumbOfHiddenNeurons()];
    		IntStream.range(0, miraiNeuralNetwork.getNumbOfHiddenNeurons()).forEach(i -> 
    		                                        miraiNeuron[i] = new MiraiNeuron(layerType,MiraiNeuralNetwork.NUMB_OF_INPUT_NEURONS));
    		break;
    	case O:
    		miraiNeuron = new MiraiNeuron[MiraiNeuralNetwork.NUMB_OF_OUTPUT_NEURONS];
    		miraiNeuron[0] = new MiraiNeuron(layerType, miraiNeuralNetwork.getNumbOfHiddenNeurons());
    		break;
    	}
    }
    
    public MiraiNeuron[] getNeurons() { return miraiNeuron; }
    public LayerType getLayerType() { return layerType; }
    public String toString() {
    	StringBuffer returnValue = new StringBuffer();
    	IntStream.range(0, miraiNeuron.length).forEach(x -> returnValue.append(miraiNeuron[x] + " "));
    	return returnValue.toString();
    }
}
