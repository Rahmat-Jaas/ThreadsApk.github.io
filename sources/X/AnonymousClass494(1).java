package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.494  reason: invalid class name */
public abstract class AnonymousClass494 implements AnonymousClass0i4 {
    public final void A02(Context context, Bundle bundle) {
        boolean z;
        String str;
        C04220Ms.A0B(context, 0);
        boolean z2 = this instanceof C27271sF;
        if (z2) {
            SharedPreferences sharedPreferences = ((C27271sF) this).A00;
            if (sharedPreferences.getInt("seen_count_for_blind_reaction_nux", 0) >= 3 || C18180wK.A04() - sharedPreferences.getLong("last_seen_sec_for_blind_reaction_nux", 0) < 604800) {
                return;
            }
        } else if (!(this instanceof C27261sE)) {
            if (this instanceof C27251sD) {
                z = !C18190wL.A1X(C28161tl.A04(((C27251sD) this).A00), "clips_separate_sequence_nux_viewed");
            } else {
                z = !C18190wL.A1X(C28161tl.A04(((C27281sG) this).A00), "clips_new_remix_introduction_nux");
            }
            if (!z) {
                return;
            }
        } else if (C18190wL.A1X(C28161tl.A04(((C27261sE) this).A00), "has_seen_collaborative_albums_creation_nux")) {
            return;
        }
        if (bundle == null) {
            bundle = C18180wK.A06();
        }
        if (z2) {
            str = "direct_share_reaction_upsell";
        } else if (this instanceof C27261sE) {
            str = "direct_shared_stack_upsell";
        } else if (this instanceof C27251sD) {
            str = "SEPARATE_SEQUENCE_INTRODUCTION_NUX";
        } else {
            str = "NEW_REMIX_INTRODUCTION_NUX_MANAGER";
        }
        bundle.putString("bottom_sheet_content_fragment", str);
        C63863iT.A0B(context, bundle, TransparentModalActivity.class, "bottom_sheet");
        if (z2) {
            SharedPreferences sharedPreferences2 = ((C27271sF) this).A00;
            AnonymousClass0wJ.A11(sharedPreferences2.edit(), "seen_count_for_blind_reaction_nux", C18190wL.A04(sharedPreferences2, "seen_count_for_blind_reaction_nux") + 1);
            AnonymousClass0wJ.A12(sharedPreferences2.edit(), "last_seen_sec_for_blind_reaction_nux", C18180wK.A04());
        } else if (this instanceof C27251sD) {
            AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(((C27251sD) this).A00)), "clips_separate_sequence_nux_viewed", true);
        } else if (this instanceof C27281sG) {
            AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(((C27281sG) this).A00)), "clips_new_remix_introduction_nux", true);
        }
    }

    public final void onSessionWillEnd() {
    }

    public final void A01() {
        if (this instanceof C27271sF) {
            AnonymousClass0wJ.A11(((C27271sF) this).A00.edit(), "seen_count_for_blind_reaction_nux", 3);
        } else if (this instanceof C27261sE) {
            AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(((C27261sE) this).A00)), "has_seen_collaborative_albums_creation_nux", true);
        }
    }
}
