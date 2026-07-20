

// optimized solution using two pointers
public class optimized {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int m1 = 0;
        int m2 = 0;
        double ans = 0;
        System.out.println("m="+m);
        System.out.println("n="+n);
        
        for(int count = 0 ; count <= (m+n)/2; count++) {
            System.out.println("m1="+m1);
            m2 = m1;
            System.out.println("count =" +count);
            if(i != m && j != n) {
                if(nums1[i] < nums2[j]) {
                    m1 = nums1[i++];
                } else {
                    m1 = nums2[j++];
                }
            }else if(i < m) {
                m1 = nums1[i++];
            }else {
                m1 = nums2[j++];
            }
        }
        if((m+n)%2 == 0) {
            ans = m1+m2;
            ans = ans/2;
        } else {
            ans = m1;
        }
    
        System.out.println(ans);

}
}
