class magical {
		private String name;
		private int age;
		
		public void setName(String name) { this.name = name; }
		public void setAge(int age) { this.age = age; }
		
		public String getName() { return name; }
		public int getAge() {return age; }
		
		void sound() {
			System.out.println("Some magical animal sound");
		}
		
		void sound(int times) {
			for (int i=0; i < times; i++) {
				sound();
			}
		}
}

class jellyfish extends magical {
		@Override
		void sound() { System.out.println("blub blubbb!!"); }
}

class cat extends magical {
		@Override
		void sound() { System.out.println("Meowwoeee"); }
}

class dinosaur extends magical {
		@Override
		void sound() { System.out.println("RAWRRRE"); }
}

public class SEATWORK3 {
		public static void main(String[] args) {
			
		  jellyfish jellyfish = new jellyfish();
			jellyfish.setName("Jellyfish");
			jellyfish.setAge(5);
			
			cat cat = new cat();
			cat.setName("kittyy");
			cat.setAge(7);
			
			dinosaur dinosaur = new dinosaur();
			dinosaur.setName("dinosaur");
			dinosaur.setAge(100);
			
			System.out.println(jellyfish.getName() + " says:");
			jellyfish.sound();
			jellyfish.sound(3);
			
			System.out.println(cat.getName() + " says:");
			cat.sound();
			cat.sound(2);
			
	   	System.out.println(dinosaur.getName() + " says:");
	   	dinosaur.sound();
	   	dinosaur.sound(4);
		
	}
}
