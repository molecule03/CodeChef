//package CodeChef.JuneLong2
//
//import java.io.BufferedReader
//import java.io.IOException
//import java.io.InputStreamReader
//import java.io.PrintWriter
//import java.util.*
//
//object GCDANDLCM{
//@JvmStatic
//    fun main(args:Array<String>){
//        val fs= FastScanner()
//        val out=PrintWriter(System.out)
//        val T=fs.nextInt()
//        for(tt in 0 until T){
//        val N=fs.nextLong()
//        if(N%2L!=0L){
//        out.println(0)
//        continue
//        }
//        val factors= printDivisors(N)
//        //            out.println(factors);
//        var count=0
//        val visited:MutableSet<String> =HashSet()
//        val sqrtN=Math.sqrt(N.toDouble()).toInt()
//        //            out.println(N+" "+sqrtN);
//        for(factor in factors){
//        for(j in 1 until sqrtN){
//        val A=j.toLong()*j
//        var G=N/factor-A
//        val B=factor*G-G
//        val b=Math.sqrt(B.toDouble()).toInt()
//        if(Math.sqrt(B.toDouble())!=b.toDouble()||B==0L){
////                        System.out.println("Because of this B:"+ B+" & G:"+G);
//        continue
//        }
//        G= gcd(j.toLong(),b.toLong())
//        G=G*G
//        var L=(j.toLong()*b/Math.sqrt(G.toDouble())).toLong()
//        L=L*L
//        if(A+B==N-(G+L)&&!visited.contains("$j,$b")){
//                        out.println("Value of $N is $A $B $G $L")
//        count++
//        visited.add("$j,$b")
//        }
//        }
//        }
//        out.println(count)
//        }
//        out.close()
//        }
//
//        fun printDivisors(n:Long):List<Long> {
//        val list:MutableList<Long> =ArrayList()
//        // Note that this loop runs till square root
//        var i=1
//        while(i<=Math.sqrt(n.toDouble())){
//        if(n%i==0L){
//        // If divisors are equal, print only one
//        if(n/i==i.toLong()){
//        list.add(i.toLong())
//        //                    System.out.print(" "+ i);
//        }else{
//        list.add(i.toLong())
//        list.add(n/i)
//        //                    System.out.print(i+" " + n/i + " " );
//        }
//        }
//        i++
//        }
//        return list
//        }
//
//        fun gcd(a:Long,b:Long):Long{
//        return if(a==0L)b else gcd(b%a,a)
//        }
//
//        // method to return LCM of two numbers
//        fun lcm(a:Long,b:Long):Long{
//        return a/ gcd(a,b) *b
//        }
//
//        val random=Random()
//        const val mod=1000000007
//        fun ruffleSort(a:IntArray){
//        val n=a.size //shuffle, then sort
//        for(i in 0 until n){
//        val oi= random.nextInt(n)
//        val temp=a[oi]
//        a[oi]=a[i]
//        a[i]=temp
//        }
//        Arrays.sort(a)
//        }
//
//        fun add(a:Long,b:Long):Long{
//        return(a+b)% mod
//        }
//
//        fun sub(a:Long,b:Long):Long{
//        return((a-b)% mod + mod)% mod
//        }
//
//        fun mul(a:Long,b:Long):Long{
//        return a*b% mod
//        }
//
//        fun exp(base:Long,exp:Long):Long{
//        if(exp==0L)return 1
//        val half= exp(base,exp/2)
//        return if(exp%2==0L) mul(half,half) else mul(half, mul(half,base))
//        }
//
//        var factorials=LongArray(2000001)
//        var invFactorials=LongArray(2000001)
//        fun precompFacts(){
//        invFactorials[0]=1
//        factorials[0]= invFactorials[0]
//        for(i in 1 until factorials.size) factorials[i]= mul(factorials[i-1],i.toLong())
//        invFactorials[factorials.size-1]= exp(factorials[factorials.size-1],(mod -2).toLong())
//        for(i in invFactorials.size-2 downTo 0) invFactorials[i]= mul(invFactorials[i+1],(i+1).toLong())
//        }
//
//        fun nCk(n:Int,k:Int):Long{
//        return mul(factorials[n], mul(invFactorials[k], invFactorials[n-k]))
//        }
//
//        fun sort(a:IntArray){
//        val l=ArrayList<Int>()
//        for(i in a)l.add(i)
//        Collections.sort(l)
//        for(i in a.indices)a[i]=l[i]
//        }
//
//        internal
//
//class FastScanner {
//    var br = BufferedReader(InputStreamReader(System.`in`))
//    var st = StringTokenizer("")
//    operator fun
//
//    next():
//
//    String {
//        while (!st.hasMoreTokens()) try {
//            st = StringTokenizer(br.readLine())
//        } catch (e:IOException){
//            e.printStackTrace()
//        }
//        return st.nextToken()
//    }
//
//    fun nextInt():
//
//    Int {
//        return next().toInt()
//    }
//
//    fun readArray(n:Int):
//
//    IntArray {
//        val a = IntArray(n)
//        for (i in 0 until n)a[i] = nextInt()
//        return a
//    }
//
//    fun nextLong():
//
//    Long {
//        return next().toLong()
//    }
//}
//}