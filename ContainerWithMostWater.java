public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height)); // 49

        int[] height2 = {1, 1};
        System.out.println(maxArea(height2)); // 1

        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println(maxArea(height3)); // 16
    }

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;

        int tempProduct = Integer.MIN_VALUE;
        int maxProduct = Integer.MIN_VALUE;
        int h = -1;
        int w = -1;
        while(left<right){
            h = Math.min(height[left],height[right]);
            w = right - left;
            tempProduct = w * h;
            maxProduct = Math.max(tempProduct,maxProduct);

            if(height[left]<height[right] && left < height.length && right>0){
                left++;
            }
            else{
                right--;
            }
        }
        return maxProduct;


        /*int tempProduct = Integer.MIN_VALUE;
	    int maxProduct = Integer.MIN_VALUE;
	    int h = -1;
	    int w = -1;

        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                h = Math.min(height[i],height[j]);
                w = j-i;
                tempProduct = w * h;
                maxProduct = Math.max(tempProduct,maxProduct);

            }
        }
        return maxProduct;*/
    }
}
