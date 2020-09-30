package Fract;

	public class Fractio {
		public int num;
		public int den;

		Fractio(int num, int den) {
			this.num = num;
			this.den = den;
		}

		public String toString() {
			return Integer.toString(this.num) + '/' + Integer.toString(this.den);
		}
	}
