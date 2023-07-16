package X;

import com.facebook.pando.TreeJNI;
import com.instagram.graphql.instagramschema.IGFxFbProfilePicIsSilhouetteQueryResponseImpl;

/* renamed from: X.41d  reason: invalid class name and case insensitive filesystem */
public final class C679241d implements C83334rD {
    public boolean A00;

    public final void onFailure(Throwable th) {
        AnonymousClass0LU.A0B(C69794Ai.__redex_internal_original_name, "Unable to fetch avatar info");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        C143338gY r7 = (C143338gY) obj;
        if (r7 != null && (obj2 = ((AnonymousClass5z0) r7).A01) != null) {
            C1366783w A0G = C18250wR.A0G((TreeJNI) obj2, IGFxFbProfilePicIsSilhouetteQueryResponseImpl.FxAccounts.class, "fx_accounts");
            while (A0G.hasNext()) {
                IGFxFbProfilePicIsSilhouetteQueryResponseImpl.FxAccounts fxAccounts = (IGFxFbProfilePicIsSilhouetteQueryResponseImpl.FxAccounts) A0G.next();
                if (!(fxAccounts == null || fxAccounts.A00() == null)) {
                    Class<IGFxFbProfilePicIsSilhouetteQueryResponseImpl.FxAccounts.InlineXFBFXFBAccountInfo.ProfilePictureInfo> cls = IGFxFbProfilePicIsSilhouetteQueryResponseImpl.FxAccounts.InlineXFBFXFBAccountInfo.ProfilePictureInfo.class;
                    if (fxAccounts.A00().getTreeValue("profile_picture_info", cls) != null && fxAccounts.A00().getTreeValue("profile_picture_info", cls).hasFieldValue("is_silhouette")) {
                        this.A00 = fxAccounts.A00().getTreeValue("profile_picture_info", cls).getBooleanValue("is_silhouette");
                        return;
                    }
                }
            }
        }
    }
}
