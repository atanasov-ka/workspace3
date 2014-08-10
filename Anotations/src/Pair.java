
public class Pair <F, L> {
	private F first;
	private L last;
	
	public Pair(F first, L last)
	{
		this.setFirst(first);
		this.setLast(last);
	}

	public F getFirst() {
		return first;
	}

	public void setFirst(F first) {
		this.first = first;
	}

	public L getLast() {
		return last;
	}

	public void setLast(L last) {
		this.last = last;
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", last=" + last + "]";
	}
	
	

}
