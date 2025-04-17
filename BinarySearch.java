import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		int bottom=ray[0];
		int top=ray.length-1;
		int mid=0;
		while(bottom<top){
			mid=(top + bottom)/2;
			if((ray[mid])<item){
				bottom=mid+1;
			}
			if((ray[mid]>item)){
				top=mid-1;
			}
			if(ray[mid]==item){
				return mid;
			}
		}
		return -1;
	}
}
