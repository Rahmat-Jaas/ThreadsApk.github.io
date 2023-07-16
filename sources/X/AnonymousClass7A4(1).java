package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.instagram.arlink.fragment.YUVImageData;
import com.instagram.service.session.UserSession;
import java.nio.ByteBuffer;

/* renamed from: X.7A4  reason: invalid class name */
public final class AnonymousClass7A4 {
    public int A00;
    public int A01;
    public Handler A02;
    public HandlerThread A03;
    public final Handler A04 = AnonymousClass0wJ.A0F();
    public final C31017GdY A05;
    public final AnonymousClass7MG A06 = new AnonymousClass7MG(this);
    public final C121477Gh A07;
    public final C146438mF A08;
    public final C34640IcN A09;
    public final UserSession A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;

    public static boolean A00(AnonymousClass79P r4, AnonymousClass7A4 r5, boolean z) {
        Handler handler;
        Runnable r0;
        if (r4 != null) {
            Object obj = r4.A00;
            obj.getClass();
            int ordinal = ((AnonymousClass22I) obj).ordinal();
            if (ordinal != 1) {
                if (ordinal == 0) {
                    handler = r5.A04;
                    r0 = new AnonymousClass81P(r4, r5);
                } else if (ordinal == 2) {
                    handler = r5.A04;
                    r0 = new AnonymousClass81Q(r4, r5);
                } else if (ordinal == 3) {
                    handler = r5.A04;
                    r0 = new AnonymousClass81R(r4, r5);
                }
                handler.post(r0);
                return true;
            }
            Object obj2 = r4.A01;
            obj2.getClass();
            r5.A04.post(new AnonymousClass82T(r5, (String) obj2, z));
            return true;
        }
        return false;
    }

    public final void A01() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    HandlerThread handlerThread = new HandlerThread("ArLinkScanController.FrameHandlerThread", 9);
                    C13820oM.A00(handlerThread);
                    this.A03 = handlerThread;
                    handlerThread.start();
                    Looper looper = this.A03.getLooper();
                    looper.getClass();
                    this.A02 = new Handler(looper, this.A06);
                }
            }
        }
    }

    public final void A02(C30798GVt gVt) {
        Handler handler = this.A02;
        if (handler != null) {
            handler.removeMessages(2);
            if (AnonymousClass0wJ.A1X(C09120et.A02().A2G.A00.invoke()) || (!this.A0B && !this.A0C)) {
                Message obtainMessage = handler.obtainMessage(2);
                obtainMessage.setData(new YUVImageData(gVt).A03);
                handler.sendMessage(obtainMessage);
            }
        }
    }

    public final void A03(String str) {
        Handler handler = this.A02;
        if (handler != null) {
            handler.removeMessages(1);
            handler.removeMessages(2);
            handler.removeMessages(3);
            C86124wJ.A1E(handler, str, 3);
            return;
        }
        this.A08.C28();
    }

    public final void A04(byte[] bArr) {
        Handler handler = this.A02;
        if (handler != null) {
            handler.removeMessages(1);
            if (AnonymousClass0wJ.A1X(C09120et.A02().A2G.A00.invoke()) || (!this.A0B && !this.A0C)) {
                C86124wJ.A1E(handler, ByteBuffer.wrap(bArr), 1);
            }
        }
    }

    public AnonymousClass7A4(C146438mF r4, C34640IcN icN, UserSession userSession) {
        AnonymousClass2FY.A00(userSession);
        this.A09 = icN;
        this.A0A = userSession;
        this.A08 = r4;
        this.A07 = new C121477Gh(icN.requireContext(), userSession);
        this.A05 = new C31017GdY(userSession, icN.getModuleName(), (String) null);
    }
}
