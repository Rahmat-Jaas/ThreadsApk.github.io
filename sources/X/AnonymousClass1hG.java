package X;

import com.instagram.profile.edit.controller.EditProfileFieldsController;
import java.util.HashMap;

/* renamed from: X.1hG  reason: invalid class name */
public final class AnonymousClass1hG extends C63873iU {
    public final String A00;
    public final /* synthetic */ EditProfileFieldsController A01;

    public AnonymousClass1hG(EditProfileFieldsController editProfileFieldsController, String str) {
        C04220Ms.A0B(str, 2);
        this.A01 = editProfileFieldsController;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A03 = C14030oh.A03(-1849191449);
        EditProfileFieldsController editProfileFieldsController = this.A01;
        editProfileFieldsController.A07.put(this.A00, AnonymousClass227.FAILED);
        editProfileFieldsController.A06().A04();
        C14030oh.A0A(-654045345, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass227 r0;
        int A03 = C14030oh.A03(-732479103);
        AnonymousClass1TR r7 = (AnonymousClass1TR) obj;
        int A002 = AnonymousClass0wJ.A00(1046799859, r7);
        EditProfileFieldsController editProfileFieldsController = this.A01;
        HashMap hashMap = editProfileFieldsController.A07;
        String str = this.A00;
        if (r7.A02) {
            r0 = AnonymousClass227.AVAILABLE;
        } else {
            r0 = AnonymousClass227.UNAVAILABLE;
        }
        hashMap.put(str, r0);
        editProfileFieldsController.A06().A04();
        C14030oh.A0A(-996387022, A002);
        C14030oh.A0A(-1448360226, A03);
    }
}
