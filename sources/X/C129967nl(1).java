package X;

import ca.psiphon.PsiphonTunnel;
import com.facebook.graphql.impls.DcpFeaturesUploadResponseImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.7nl  reason: invalid class name and case insensitive filesystem */
public final class C129967nl implements C83334rD {
    public final SettableFuture A00;

    public final void onFailure(Throwable th) {
        C04220Ms.A0B(th, 0);
        String message = th.getMessage();
        if (message == null) {
            message = "GraphQL fail";
        }
        this.A00.set(message);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        TreeJNI treeJNI;
        String str;
        TreeJNI A03;
        C143338gY r5 = (C143338gY) obj;
        if (r5 == null || (A03 = C685344e.A03(r5)) == null) {
            treeJNI = null;
        } else {
            treeJNI = A03.getTreeValue(C18170wI.A00(PsiphonTunnel.VPN_INTERFACE_MTU), DcpFeaturesUploadResponseImpl.XfbPostDcpFeaturesUpload.class);
            if (treeJNI != null && treeJNI.hasFieldValue("is_success") && treeJNI.getBooleanValue("is_success")) {
                this.A00.set("SUCCESS");
                return;
            }
        }
        if (treeJNI == null || (str = treeJNI.getStringValue("error_message")) == null) {
            str = AnonymousClass000.A00(116);
        }
        String format = String.format("%s%s", C86144wL.A1a("Server response fail: ", str));
        C04220Ms.A06(format);
        this.A00.set(format);
    }

    public C129967nl(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }
}
