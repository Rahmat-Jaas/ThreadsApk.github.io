package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;

/* renamed from: X.0uz  reason: invalid class name and case insensitive filesystem */
public enum C17490uz {
    SERVICE_DESTROY,
    SERVICE_STOP,
    KICK_SHOULD_NOT_CONNECT,
    KICK_CONFIG_CHANGED,
    KEEPALIVE_SHOULD_NOT_CONNECT,
    EXPIRE_CONNECTION,
    OPERATION_TIMEOUT,
    PING_UNRECEIVED,
    READ_TIMEOUT,
    READ_EOF,
    READ_SOCKET,
    READ_SSL,
    READ_IO,
    READ_FORMAT,
    READ_FAILURE_UNCLASSIFIED,
    WRITE_TIMEOUT,
    WRITE_EOF,
    WRITE_SOCKET,
    WRITE_SSL,
    WRITE_IO,
    WRITE_FAILURE_UNCLASSIFIED,
    UNKNOWN_RUNTIME,
    SEND_FAILURE,
    PREEMPTIVE_RECONNECT_SUCCESS,
    AUTH_CREDENTIALS_CHANGE,
    NETWORK_LOST;

    public static C17490uz A00(Throwable th) {
        if ((th instanceof TimeoutException) || (th instanceof SocketTimeoutException)) {
            return WRITE_TIMEOUT;
        }
        if (th instanceof EOFException) {
            return WRITE_EOF;
        }
        if (th instanceof SocketException) {
            return WRITE_SOCKET;
        }
        if (th instanceof SSLException) {
            return WRITE_SSL;
        }
        if (th instanceof IOException) {
            return WRITE_IO;
        }
        return WRITE_FAILURE_UNCLASSIFIED;
    }
}
