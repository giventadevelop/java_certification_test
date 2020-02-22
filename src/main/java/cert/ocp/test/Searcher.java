package cert.ocp.test;

import java.util.stream.Stream;

public interface Searcher<V> extends AutoCloseable {

    Stream<V> search();
// fact that it can throw an exception but not recommeneded instead should
    // throw a more generic subclass
    @Override
    void close() throws Exception;
}