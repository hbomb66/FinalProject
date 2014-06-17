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
 * Restaurants generated by hbm2java
 */
@Entity
@Table(name = "restaurants", catalog = "wollits")
public class Restaurants implements java.io.Serializable {

	private int restaurantId;
	private Chains chains;
	private Locations locations;
	private byte[] orderingEnabled;
	private String timezone;
	private byte[] pickupEnabled;
	private byte[] deliveryEnabled;
	private Set<RestaurantRoles> restaurantRoleses = new HashSet<RestaurantRoles>(
			0);
	private Set<RestaurantMenus> restaurantMenuses = new HashSet<RestaurantMenus>(
			0);
	private Set<VariableDeliveryRates> variableDeliveryRateses = new HashSet<VariableDeliveryRates>(
			0);
	private Set<BusinessHours> businessHourses = new HashSet<BusinessHours>(0);
	private Set<FixedDeliveryRates> fixedDeliveryRateses = new HashSet<FixedDeliveryRates>(
			0);

	public Restaurants() {
	}

	public Restaurants(int restaurantId, Chains chains, Locations locations,
			byte[] orderingEnabled, String timezone) {
		this.restaurantId = restaurantId;
		this.chains = chains;
		this.locations = locations;
		this.orderingEnabled = orderingEnabled;
		this.timezone = timezone;
	}

	public Restaurants(int restaurantId, Chains chains, Locations locations,
			byte[] orderingEnabled, String timezone, byte[] pickupEnabled,
			byte[] deliveryEnabled, Set<RestaurantRoles> restaurantRoleses,
			Set<RestaurantMenus> restaurantMenuses,
			Set<VariableDeliveryRates> variableDeliveryRateses,
			Set<BusinessHours> businessHourses,
			Set<FixedDeliveryRates> fixedDeliveryRateses) {
		this.restaurantId = restaurantId;
		this.chains = chains;
		this.locations = locations;
		this.orderingEnabled = orderingEnabled;
		this.timezone = timezone;
		this.pickupEnabled = pickupEnabled;
		this.deliveryEnabled = deliveryEnabled;
		this.restaurantRoleses = restaurantRoleses;
		this.restaurantMenuses = restaurantMenuses;
		this.variableDeliveryRateses = variableDeliveryRateses;
		this.businessHourses = businessHourses;
		this.fixedDeliveryRateses = fixedDeliveryRateses;
	}

	@Id
	@Column(name = "restaurant_id", unique = true, nullable = false)
	public int getRestaurantId() {
		return this.restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chain_id", nullable = false)
	public Chains getChains() {
		return this.chains;
	}

	public void setChains(Chains chains) {
		this.chains = chains;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "location_id", nullable = false)
	public Locations getLocations() {
		return this.locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	@Column(name = "ordering_enabled", nullable = false)
	public byte[] getOrderingEnabled() {
		return this.orderingEnabled;
	}

	public void setOrderingEnabled(byte[] orderingEnabled) {
		this.orderingEnabled = orderingEnabled;
	}

	@Column(name = "timezone", nullable = false)
	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@Column(name = "pickup_enabled")
	public byte[] getPickupEnabled() {
		return this.pickupEnabled;
	}

	public void setPickupEnabled(byte[] pickupEnabled) {
		this.pickupEnabled = pickupEnabled;
	}

	@Column(name = "delivery_enabled")
	public byte[] getDeliveryEnabled() {
		return this.deliveryEnabled;
	}

	public void setDeliveryEnabled(byte[] deliveryEnabled) {
		this.deliveryEnabled = deliveryEnabled;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurants")
	public Set<RestaurantRoles> getRestaurantRoleses() {
		return this.restaurantRoleses;
	}

	public void setRestaurantRoleses(Set<RestaurantRoles> restaurantRoleses) {
		this.restaurantRoleses = restaurantRoleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurants")
	public Set<RestaurantMenus> getRestaurantMenuses() {
		return this.restaurantMenuses;
	}

	public void setRestaurantMenuses(Set<RestaurantMenus> restaurantMenuses) {
		this.restaurantMenuses = restaurantMenuses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurants")
	public Set<VariableDeliveryRates> getVariableDeliveryRateses() {
		return this.variableDeliveryRateses;
	}

	public void setVariableDeliveryRateses(
			Set<VariableDeliveryRates> variableDeliveryRateses) {
		this.variableDeliveryRateses = variableDeliveryRateses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurants")
	public Set<BusinessHours> getBusinessHourses() {
		return this.businessHourses;
	}

	public void setBusinessHourses(Set<BusinessHours> businessHourses) {
		this.businessHourses = businessHourses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurants")
	public Set<FixedDeliveryRates> getFixedDeliveryRateses() {
		return this.fixedDeliveryRateses;
	}

	public void setFixedDeliveryRateses(
			Set<FixedDeliveryRates> fixedDeliveryRateses) {
		this.fixedDeliveryRateses = fixedDeliveryRateses;
	}

}