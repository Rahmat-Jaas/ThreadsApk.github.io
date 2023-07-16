package X;

import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.events.data.EventsRepository;
import com.instagram.events.graphql.EventInviteesImpl;
import com.instagram.events.share.model.EventShareInfo;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0100000_I2_3;

/* renamed from: X.10G  reason: invalid class name */
public final class AnonymousClass10G extends C62793ak {
    public final EventsRepository A00;
    public final C86064wD A01;
    public final C86094wG A02;
    public final UserSession A03;
    public final C84714tk A04;

    public final EventShareInfo A00(EventInviteesImpl.Event event, String str) {
        String str2;
        Class cls;
        TreeJNI treeValue;
        String str3 = str;
        C04220Ms.A0B(str3, 0);
        EventInviteesImpl.Event event2 = event;
        String stringValue = event2.getStringValue("event_link");
        TreeJNI treeValue2 = event2.getTreeValue("profile_picture_object", EventInviteesImpl.Event.ProfilePictureObject.class);
        if (treeValue2 != null) {
            str2 = treeValue2.getStringValue("profile_pic_url");
        } else {
            str2 = null;
        }
        String stringValue2 = event2.getStringValue(DialogModule.KEY_TITLE);
        String userId = this.A03.getUserId();
        String stringValue3 = event2.getStringValue("time_string");
        String stringValue4 = event2.getStringValue("custom_location");
        if (stringValue4 == null && ((treeValue = event2.getTreeValue("location", cls)) == null || (stringValue4 = C18220wO.A0l(treeValue)) == null)) {
            TreeJNI treeValue3 = event2.getTreeValue("location", (cls = EventInviteesImpl.Event.Location.class));
            if (treeValue3 != null) {
                stringValue4 = treeValue3.getStringValue("address");
            } else {
                stringValue4 = null;
            }
        }
        return new EventShareInfo(stringValue, str3, userId, str2, stringValue2, stringValue3, stringValue4, C18180wK.A1Z(event2.getEnumValue("visibility", AnonymousClass220.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), AnonymousClass220.PUBLIC), AnonymousClass0wJ.A1T(event2.getBooleanValue("is_link_sharing_enabled") ? 1 : 0, 1), C18180wK.A1Z(event2.getEnumValue("viewer_status", AnonymousClass22S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), AnonymousClass22S.OWNER));
    }

    public AnonymousClass10G(EventsRepository eventsRepository, UserSession userSession) {
        this.A03 = userSession;
        EventsRepository eventsRepository2 = eventsRepository;
        this.A00 = eventsRepository2;
        C84714tk A012 = AnonymousClass7J0.A01(new KtSLambdaShape14S0100000_I2_3(14, (C146958n9) null), eventsRepository2.A03);
        C83224qz A002 = AnonymousClass3J5.A00(this);
        C146938n7 r0 = AnonymousClass74I.A01;
        AnonymousClass0ZV r17 = AnonymousClass0ZV.A00;
        this.A02 = C25753DrP.A04(new AnonymousClass1p9(AnonymousClass253.NONE, AnonymousClass251.NONE, (String) null, (String) null, (String) null, (String) null, (String) null, "😀", (String) null, (String) null, (String) null, (String) null, r17, r17, r17, r17, (List) null, false, false, false, true, false), A002, A012, r0);
        C27442EnY enY = new C27442EnY();
        this.A01 = enY;
        this.A04 = AnonymousClass7C4.A02(enY);
    }
}
