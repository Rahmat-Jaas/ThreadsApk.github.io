package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0oe  reason: invalid class name and case insensitive filesystem */
public final class C14000oe {
    static {
        AnonymousClass0D8.A03 = true;
    }

    public static int A00(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Handler handler) {
        int repeatingRequest = cameraCaptureSession.setRepeatingRequest(captureRequest, captureCallback, handler);
        if (AnonymousClass0D8.A04()) {
            CameraDevice device = cameraCaptureSession.getDevice();
            try {
                ReadWriteLock readWriteLock = AnonymousClass0D8.A02;
                readWriteLock.readLock().lock();
                List list = AnonymousClass0D8.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass0D7) list.get(i)).CM3(device);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                AnonymousClass0D8.A02.readLock().unlock();
                throw th;
            }
        }
        return repeatingRequest;
    }

    public static void A01(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        if (AnonymousClass0D8.A04()) {
            CameraDevice device = cameraCaptureSession.getDevice();
            try {
                ReadWriteLock readWriteLock = AnonymousClass0D8.A02;
                readWriteLock.readLock().lock();
                List list = AnonymousClass0D8.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass0D7) list.get(i)).CMZ(device);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                AnonymousClass0D8.A02.readLock().unlock();
                throw th;
            }
        }
    }
}
