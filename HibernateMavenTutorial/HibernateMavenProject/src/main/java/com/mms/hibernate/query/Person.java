package com.mms.hibernate.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@Entity
public class Person {
	  @Id
	    @GeneratedValue
	    private Long id;

	    private String name;

	    private String nickName;

	    private String address;

	    @Temporal(TemporalType.TIMESTAMP )
	    private Date createdOn;
	    
	    @OneToMany(mappedBy="person", cascade=CascadeType.ALL)
	    @OrderColumn(name="order_id")
	    List<Phone> phones = new ArrayList<Phone>();
	    
	    @ElementCollection
	    @MapKeyEnumerated(EnumType.STRING)
	    private Map<AddressType , String> addresses = new HashMap<AddressType , String>();
	    
	    @Version
	    private int version;
	    
	    public Person()
	    {
	    	
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNickName() {
			return nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Date getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}

		public void addPhone(Phone phone)
		{
			phones.add(phone);
			phone.setPerson(this);
		}
		
		
		public void removePhone(Phone phone)
		{
			phones.remove(phone);
			phone.setPerson(null);
		}

		public Map<AddressType, String> getAddresses() {
			return addresses;
		}

		public void setAddresses(Map<AddressType, String> addresses) {
			this.addresses = addresses;
		}

		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

}
