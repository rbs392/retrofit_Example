import retrofit.Call;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by bala on 11/9/15.
 */
class RetrofitMe {

    interface Service{
        @GET("/users/{user}/repo")
        Call getRepo(@Path("user") String user);
    }

    public static void main(String[] args){
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api/github.com").build();

        System.out.println(retrofit);

    }

}
