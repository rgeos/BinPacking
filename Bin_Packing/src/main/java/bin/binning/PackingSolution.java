package bin.binning;

@org.optaplanner.core.api.domain.solution.PlanningSolution(autoDiscoverMemberType = org.optaplanner.core.api.domain.autodiscover.AutoDiscoverMemberType.FIELD)
@javax.xml.bind.annotation.XmlRootElement
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class PackingSolution implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	
	// properties
	@javax.annotation.Generated(value = {"org.optaplanner.workbench.screens.domaineditor.client.widgets.planner.PlannerDataObjectEditor"})
	@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(value = org.optaplanner.persistence.jaxb.api.score.buildin.hardsoft.HardSoftScoreJaxbXmlAdapter.class)
	@org.kie.api.definition.type.Label(value = "Generated Planner score field")
	@org.optaplanner.core.api.domain.solution.PlanningScore
	private org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score;

	@org.kie.api.definition.type.Label(value = "The list of bins")
	@org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "binReference")
	private java.util.List<bin.binning.Bin> listBins;

	@org.kie.api.definition.type.Label(value = "The list of items")
	private java.util.List<bin.binning.Item> listItems;

    // cosntructor(s)
	public PackingSolution() {
	}

	public PackingSolution(
			org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score,
			java.util.List<bin.binning.Bin> listBins,
			java.util.List<bin.binning.Item> listItems) {
		this.score = score;
		this.listBins = listBins;
		this.listItems = listItems;
	}

    // getter(s) & setter(s)
	public org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore getScore() {
		return this.score;
	}

	public void setScore(
			org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score) {
		this.score = score;
	}

	public java.util.List<bin.binning.Bin> getListBins() {
		return this.listBins;
	}

	public void setListBins(java.util.List<bin.binning.Bin> listBins) {
		this.listBins = listBins;
	}

	public java.util.List<bin.binning.Item> getListItems() {
		return this.listItems;
	}

	public void setListItems(java.util.List<bin.binning.Item> listItems) {
		this.listItems = listItems;
	}

}