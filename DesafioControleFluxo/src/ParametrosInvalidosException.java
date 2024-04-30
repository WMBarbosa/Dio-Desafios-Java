import java.io.Serial;
import java.rmi.server.UID;

public class ParametrosInvalidosException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

public ParametrosInvalidosException(String msg){
    super(msg);
}

}
