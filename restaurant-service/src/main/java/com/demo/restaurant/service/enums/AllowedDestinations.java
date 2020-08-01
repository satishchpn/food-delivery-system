package com.demo.restaurant.service.enums;
public enum AllowedDestinations {
		// Constants with values
		Marathalli(560032), BTM(560033), ITPL(560034), KUNDANHALLI(560035), SILKBOARD(560036);

		private int destinations;

		// Constructor to initialize the instance variable
		AllowedDestinations(int destinations) {
			this.setDestinations(destinations);
		}

		public int getDestinations() {
			return destinations;
		}

		public void setDestinations(int destinations) {
			this.destinations = destinations;
		}
	}