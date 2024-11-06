import java.util.Scanner;
class HeadSets{
    private String headsetName;
    private String brand;
    private Integer price;
    private Boolean available;
    HeadSets(String headset_name,String brand_name,Integer headset_price,Boolean headset_available){
        this.headsetName=headset_name;
        this.brand=brand_name;
        this.price=headset_price;
        this.available=headset_available;
    }
    public void setHeadsetName(String headset_Name){
        this.headsetName=headset_Name;
    }
    public String getHeadsetName(){
        return this.headsetName;
    }

    public void setBrand(String brand_Name){
        this.brand=brand_Name;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setPrice(Integer headset_Price){
        this.price=headset_Price;
    }
    public Integer getPrice(){
        return this.price;
    }

    public void setAvailable(Boolean headset_Available){
        this.available=headset_Available;
    }
    public Boolean isAvailable(){
        return this.available;
    }
}

public class java_2nd_question{
    public static Integer findTotalPriceForGivenBrand(String search_brand,HeadSets[] head_set_shop){
        int total_price=0;
        int cnt=0;
        for(HeadSets it:head_set_shop){
            if(it.getBrand().equalsIgnoreCase(search_brand)){
                cnt++;
                total_price+=it.getPrice();
            }
        }
        if(cnt==0){
            return 0;
        }
        return total_price;
    }
    public static HeadSets findAvailableHeadsetWithSecondPrice(HeadSets[] head_set_shop){
        int cnt=0;
        for(HeadSets it:head_set_shop){
            if(it.isAvailable()){
                cnt++;
            }
        }
        int k=0;
        HeadSets[] newheadsets=new HeadSets[cnt];
        for(HeadSets it:head_set_shop){
            if(it.isAvailable()){
                newheadsets[k]=it;
                k++;
            }
        }
        HeadSets temp=null;
        int n= newheadsets.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(newheadsets[i].getPrice()>newheadsets[j].getPrice()){
                    temp=newheadsets[i];
                    newheadsets[i]=newheadsets[j];
                    newheadsets[j]=temp;
                }
            }
        }
        if(cnt>0){
            return newheadsets[1];
        }else{
            return null;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HeadSets[] head_set_shop=new HeadSets[n];
        for(int i=0;i<n;i++){
            String HeadSetName=sc.nextLine();
            String HeadSetBrand=sc.nextLine();
            Integer HeadSetPrice=sc.nextInt();
            Boolean HeadSetAvailable=sc.nextBoolean();
            sc.nextLine();
            head_set_shop[i]=new HeadSets(HeadSetName,HeadSetBrand,HeadSetPrice,HeadSetAvailable);
        }

        String search_band=sc.nextLine();
        Integer total_price = findTotalPriceForGivenBrand(search_band,head_set_shop);
        if(total_price>0){
            System.out.println(total_price);
        }else{
            System.out.println("No HeadSets available with the given brand");
        }

        HeadSets res=findAvailableHeadsetWithSecondPrice(head_set_shop);
        if(res!=null){
            System.out.println(res.getHeadsetName());
            System.out.println(res.getPrice());
        }else{
            System.out.println("No Headsets Available");
        }
    }
}

