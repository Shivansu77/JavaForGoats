public class gasStation {
    static class Pair{
        int d;
        int p;
        Pair(int d,int p){
            this.d=d;
            this.p=p;
        }
    }
    public static void main(String[] args) {
        int []dist={5,6,7,8,6,4};
        int []petrol={6,7,4,10,6,5};
        System.out.println(GasStation(dist,petrol));
    }
    public static int GasStation(int []dist,int []petrol){
        Pair []arr=new Pair[dist.length];
        for(int i=0;i<dist.length;i++){
            arr[i]=new Pair(dist[i],petrol[i]);
        }
        int total=0;
        int curr=0;
        int start=0;
        for(int i=0;i<dist.length;i++){
            int gain=petrol[i]-dist[i];
            total+=gain;
            curr+=gain;
            if(curr<0){
                start=i+1;
                curr=0;

            }
        }
        return (total >= 0) ? start : -1;
    }

}
