package bin.binning;

public class Bin implements java.io.Serializable {

	static final long serialVersionUID = 1L;

    // properties
	@org.kie.api.definition.type.Label("The total volume of the bin")
	private int volume;
	
	@org.kie.api.definition.type.Label("The id of the bin")
	private long id;

	@org.kie.api.definition.type.Label(value = "The weight (cost) of using this bin")
	private int weight;

    // cosntructor(s)
	public Bin() {
	}

	public Bin(int volume, long id, int weight) {
		this.volume = volume;
		this.id = id;
		this.weight = weight;
	}
	
	// getter(s) & setter(s)
	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}