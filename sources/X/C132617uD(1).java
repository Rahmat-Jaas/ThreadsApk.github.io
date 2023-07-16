package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.7uD  reason: invalid class name and case insensitive filesystem */
public final class C132617uD implements C27796EtR {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C171799zz A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass792 A03;

    public C132617uD(Activity activity, C171799zz r2, UserSession userSession, AnonymousClass792 r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = userSession;
        this.A00 = activity;
    }

    public final void ByD(Exception exc) {
        C63813iO.A03(this.A00, "startCreateStandaloneFundraiserStickerStory_unknown_error_occured", 2131837305, 0);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        Bundle A06 = C18180wK.A06();
        A06.putSerializable(AnonymousClass000.A00(20), this.A01);
        try {
            A06.putString(AnonymousClass000.A00(690), file.getAbsolutePath());
            String A002 = AnonymousClass000.A00(697);
            AnonymousClass792 r6 = this.A03;
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            String str = r6.A09;
            if (str != null) {
                A0K.A0d(DialogModule.KEY_TITLE, str);
            }
            String str2 = r6.A08;
            if (str2 != null) {
                A0K.A0d("subtitle", str2);
            }
            if (r6.A03 != null) {
                A0K.A0U("fundraiser_creator");
                AnonymousClass720.A00(A0K, r6.A03);
            }
            String str3 = r6.A07;
            if (str3 != null) {
                A0K.A0d("fundraiser_id", str3);
            }
            if (r6.A01 != null) {
                A0K.A0U("new_fundraiser_info");
                AnonymousClass716.A00(A0K, r6.A01);
            }
            String str4 = r6.A04;
            if (str4 != null) {
                A0K.A0d("cover_photo_url", str4);
            }
            String str5 = r6.A06;
            if (str5 != null) {
                A0K.A0d(DevServerEntity.COLUMN_DESCRIPTION, str5);
            }
            if (r6.A02 != null) {
                A0K.A0U(C18170wI.A00(139));
                AnonymousClass720.A00(A0K, r6.A02);
            }
            String str6 = r6.A05;
            if (str6 != null) {
                A0K.A0d("source", str6);
            }
            A0K.A0b("cohosts_count", r6.A00);
            A06.putString(A002, C18180wK.A0h(A0K, A0d));
            A06.putParcelable(AnonymousClass000.A00(698), (Parcelable) null);
            Activity activity = this.A00;
            C63863iT.A06(activity, A06, this.A02, TransparentModalActivity.class, AnonymousClass000.A00(443)).A0I(activity);
        } catch (IOException unused) {
            C10450iM.A03(AnonymousClass000.A00(272), "Could not json serialize model StandaloneFundraiserStickerModel.");
        }
    }
}
