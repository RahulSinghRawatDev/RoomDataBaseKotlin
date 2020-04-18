# RoomDataBaseKotlin
<p><b>Best Sample of Persisitance database Room with Kotlin.</p></b>
<h1>Room</h1>
<p><b>Room is a Persistance library that provides an abstraction layer over the top of SqlLite Database.It is robust SQL object mapping library.</b></p>

<h2>Consist of three components.</h2>
<p><b>1. @Entity</b></p>
<p><b>2. @Dao</b></p>
<p><b>3. @Database</b></p>


<h2>Room supported queries are :-</h2>
<p><b>1. @Insert </b></p>
<p><b>2. @Update </b></p>
<p><b>3. @Delete </b></p>
<p><b>4. @Query </b></p>
<p><b>5. @RawQuery </b></p>



<h2>Advantages of Room database over SqlLite Database</h2>
<p><b>1. It has extended its support for RxJava , Coroutines , Viewmodel and Paging libraries that makes the work really very easy thus removing huge boilerplate code.</b></p>
<p><b>2. All the queries except the @RawQuery are checked at compile time that means if you write any wrong query then it will throw an complile time exception and the issue will get caught there only.</b></p>
<p><b>3. It will throw IllegalStateException if you try to access database from MainThread.</b></p>

