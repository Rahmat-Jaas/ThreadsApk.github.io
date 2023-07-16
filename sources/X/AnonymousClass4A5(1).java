package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.4A5  reason: invalid class name */
public final class AnonymousClass4A5 implements C33841Hva {
    public final /* synthetic */ C62313Yf A00;
    public final /* synthetic */ AnonymousClass45J A01;

    public final String getName() {
        return "handleFacebookPictureAvailable";
    }

    public final int getRunnableId() {
        return 249;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public AnonymousClass4A5(C62313Yf r1, AnonymousClass45J r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFinish() {
        AnonymousClass35V r0;
        C62313Yf r4 = this.A00;
        synchronized (r4) {
            if (r4.A07 && (r0 = r4.A03) != null) {
                AnonymousClass1cR r3 = r0.A00;
                Bitmap bitmap = null;
                Bitmap bitmap2 = r4.A01;
                if (bitmap2 != null) {
                    bitmap = bitmap2.copy(bitmap2.getConfig(), r4.A01.isMutable());
                }
                r3.A00 = bitmap;
                r3.A02.A00 = bitmap;
                if (r3.isResumed()) {
                    AnonymousClass1cR.A00(r3);
                    r3.A04.BlL(r3.getContext(), r3.A02);
                }
            }
        }
    }

    public final void run() {
        C62313Yf r4 = this.A00;
        if (!C69794Ai.A03(r4.A04)) {
            ImageUrl A002 = AnonymousClass3WG.A00(C18220wO.A0F(new Uri.Builder().scheme("https").authority("graph.facebook.com").appendPath("me").appendPath("picture").appendQueryParameter("access_token", this.A01.A00).appendQueryParameter(IgReactMediaPickerNativeModule.WIDTH, "1080"), IgReactMediaPickerNativeModule.HEIGHT, "1080"));
            Bitmap A09 = C37744K2e.A01().A09(A002);
            if (A09 != null) {
                if (!A09.isRecycled()) {
                    A09 = C31540GrE.A01(A09, 1, false);
                }
                if (!A09.isRecycled() && C63173fJ.A05(AnonymousClass0TJ.A05, 18299446898984653L)) {
                    Boolean A0X = C18180wK.A0X();
                    synchronized (r4) {
                        if (r4.A07) {
                            r4.A05 = A0X;
                        }
                    }
                    synchronized (r4) {
                        if (r4.A07) {
                            r4.A02 = A002;
                        }
                    }
                    synchronized (r4) {
                        if (r4.A07 && !A09.isRecycled()) {
                            r4.A01 = A09;
                        }
                    }
                    C62313Yf.A01(r4);
                }
            }
        }
    }
}
