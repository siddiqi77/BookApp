package com.Book.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users_Roles")
public class Role {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="role_id")
	    private Long id;

	    @Column(name="role_name")
	    private String name;

		public Role(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public Role() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Role [id=" + id + ", name=" + name + "]";
		}
	    
	    
}
