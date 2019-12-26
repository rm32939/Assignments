package assignment;

public class department {
		
	

		private String location;
		

		public department(String location) {
			super();
			this.location = location;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		

		@Override
		public String toString() {
			return "department [location=" + location + "]";
		} 
		
		
		
		
		
}
