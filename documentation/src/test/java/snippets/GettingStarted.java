package snippets;

// tag::getting-started[]
// tag::getting-started[]
import io.smallrye.mutiny.Multi;

public class GettingStarted {

    public static void main(String[] args) {
        Multi.createFrom().items("hello", "world")
                .onItem().apply(s -> s.toUpperCase() + " ")
                .onCompletion().continueWith("!")
                .subscribe().with(System.out::print);
    }

}
//end::getting-started[]
