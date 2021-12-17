package test1;
import java.util.ArrayList;
import java.util.LinkedList;
public class Test1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=5;
        a[1]=6;
        a[2]=7;
        a[3]=8;
        a[4]=9;
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-------------------------------------------------------");
        // هنا في اري سيبقى حجم المصفوفة كما هو ولا يتغير اذا اردنا الاضافة عليها ستكون عملية معقدة وصعبة لذا نستخدم اري لست و لنكد اري لست 
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("hi !");
        arr1.add("there");
        arr1.remove("there");
        //---------------------------------------------------------------------------------------
        //طبعا بنفع نعمل اري من سترنق او انتجر او اي اشي
        //الاري لست الها خواص اكتر من الاري العادية ومرنة وسهلة التعامل
        ArrayList<String> arraylistclone = (ArrayList<String>)arr1.clone();
        //او ممكن نعملها بتاخد كل القيم سواء كانت سترنق او انتجر او اي متغير ثاني
        //---------------------------------------------------------------------------------------
        ArrayList arr2 = new ArrayList();
        arr2.add("hello");
        arr2.add(5);
        arr2.add(true);
        arr2.add(2.34); 
        //---------------------------------------------------------------------------------------
        System.out.println(arr1);
        System.out.println(arraylistclone);
        System.out.println(arr2);
        System.out.println("-------------------------------------------------------");
        arr1.clear();
        //---------------------------------------------------------------------------------------
        System.out.println(arr1);
        System.out.println(arraylistclone);
        System.out.println("-------------------------------------------------------");
        //---------------------------------------------------------------------------------------
        //وفي برضو اللنكد لست هي عبارة عن اري لست لكن احسن في حالة انك حاولت تحذف او تغير على البيانات بشكل كبير
        //اما اري لست فهي احسن في حال انك بدك تحفظ قاعدة بيانات كبيرة
        //لانو الاري لست ستكون بطيئة في التغيير على المتغيرات في الرام بينما اللنكد لست سوف تكون اسرع بكثير من الاري لست
        LinkedList arr3 = new LinkedList();
        arr3.add("A");
        arr3.add("B");
        arr3.add("C");
        arr3.add("D");
        arr3.add("E");
        LinkedList arr4 = new LinkedList();
        arr4.add(arr3);
        System.out.println("arr4 elements: " + arr3);
        System.out.println("Number of elements in arr3 : " + arr3.size());
        System.out.println("arr4 elements: " + arr4.get(0));
        System.out.println("Number of elements in arr4 : " + arr4.size());
        System.out.println("-------------------------------------------------------");
    }
}
