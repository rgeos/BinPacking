package bin.binning;

@org.optaplanner.core.api.domain.entity.PlanningEntity
public class Item implements java.io.Serializable {

	static final long serialVersionUID = 1L;

    // properties
	@org.kie.api.definition.type.Label("Item size")
	private int size;

	@org.kie.api.definition.type.Label("The bin to be assigned to")
	// the planning variable
	@org.optaplanner.core.api.domain.variable.PlanningVariable(valueRangeProviderRefs = {"binReference"})
	private bin.binning.Bin bin;

	@org.kie.api.definition.type.Label(value = "The id of the item")
	private int id;

    // constructor(s)
	public Item() {
	}

	public Item(int size, bin.binning.Bin bin, int id) {
		this.size = size;
		this.bin = bin;
		this.id = id;
	}
	
	// getter(s) & setter(s)
	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public bin.binning.Bin getBin() {
		return this.bin;
	}

	public void setBin(bin.binning.Bin bin) {
		this.bin = bin;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}