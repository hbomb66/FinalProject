package wollits.hibernate;

// Generated Jun 14, 2014 7:45:27 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CustomizationOptions generated by hbm2java
 */
@Entity
@Table(name = "customization_options", catalog = "wollits")
public class CustomizationOptions implements java.io.Serializable {

	private int customizationOptionId;
	private Customizations customizations;
	private String name;
	private byte[] price;
	private String description;
	private Integer priority;
	private Set<OrderSelectedCustomizationOptions> orderSelectedCustomizationOptionses = new HashSet<OrderSelectedCustomizationOptions>(
			0);

	public CustomizationOptions() {
	}

	public CustomizationOptions(int customizationOptionId, String name,
			byte[] price) {
		this.customizationOptionId = customizationOptionId;
		this.name = name;
		this.price = price;
	}

	public CustomizationOptions(
			int customizationOptionId,
			Customizations customizations,
			String name,
			byte[] price,
			String description,
			Integer priority,
			Set<OrderSelectedCustomizationOptions> orderSelectedCustomizationOptionses) {
		this.customizationOptionId = customizationOptionId;
		this.customizations = customizations;
		this.name = name;
		this.price = price;
		this.description = description;
		this.priority = priority;
		this.orderSelectedCustomizationOptionses = orderSelectedCustomizationOptionses;
	}

	@Id
	@Column(name = "customization_option_id", unique = true, nullable = false)
	public int getCustomizationOptionId() {
		return this.customizationOptionId;
	}

	public void setCustomizationOptionId(int customizationOptionId) {
		this.customizationOptionId = customizationOptionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customization_id")
	public Customizations getCustomizations() {
		return this.customizations;
	}

	public void setCustomizations(Customizations customizations) {
		this.customizations = customizations;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", nullable = false)
	public byte[] getPrice() {
		return this.price;
	}

	public void setPrice(byte[] price) {
		this.price = price;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "priority")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customizationOptions")
	public Set<OrderSelectedCustomizationOptions> getOrderSelectedCustomizationOptionses() {
		return this.orderSelectedCustomizationOptionses;
	}

	public void setOrderSelectedCustomizationOptionses(
			Set<OrderSelectedCustomizationOptions> orderSelectedCustomizationOptionses) {
		this.orderSelectedCustomizationOptionses = orderSelectedCustomizationOptionses;
	}

}
