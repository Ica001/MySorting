import java.util.Vector;

public class Sortator {
Vector<Integer> InputArray;
Vector<Integer> OutputArray;
public Sortator(Vector<Integer> inputVector) {
	InputArray=inputVector;
	}

private boolean contain(Integer x,int l,int r) {
	if((OutputArray.get(l)<=x) &&(x<=OutputArray.get(r))) return true;
	return false;
}
private void f(Integer x ,int l ,int r) {
if(r==l+1) OutputArray.insertElementAt(x, r);
else if(contain(x, l, (l+r)/2)) f(x,l,(l+r)/2);
else f(x,(l+r)/2,r);
}
public void setVectorForSort(Vector<Integer> input) {
	InputArray=input;
}
public Vector<Integer> sort() {
	OutputArray=new Vector<Integer>();
	if(InputArray.size()>=2) {
	Integer i0=InputArray.get(0);
	Integer i1=InputArray.get(1);
	if(i0<i1) {
	OutputArray.add(i0);
	OutputArray.add(i1);
	}
	else {
		OutputArray.add(i1);
		OutputArray.add(i0);
	}
}else OutputArray=InputArray;
	Integer element;
	for(int i=2;i<InputArray.size();i++) {
		 element=InputArray.get(i);
		 
		if(element<=OutputArray.get(0)) OutputArray.insertElementAt(element, 0);
		else if(OutputArray.lastElement()<=element) OutputArray.insertElementAt(element, OutputArray.size());
		else {
		f(InputArray.get(i),0,OutputArray.size()-1);
		}
	}
	
	return OutputArray;
	
}

}
