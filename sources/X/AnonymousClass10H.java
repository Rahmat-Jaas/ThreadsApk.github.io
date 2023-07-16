package X;

import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.events.data.EventsRepository;
import com.instagram.events.graphql.EventInviteesImpl;
import com.instagram.events.share.model.EventShareInfo;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0100000_I2_3;

/* renamed from: X.10H  reason: invalid class name */
public final class AnonymousClass10H extends C62793ak {
    public final EventsRepository A00;
    public final C86064wD A01;
    public final C84714tk A02;
    public final C86094wG A03;
    public final UserSession A04;

    public final EventShareInfo A00(EventInviteesImpl.Event event, String str) {
        String str2;
        String str3 = str;
        String stringValue = event.getStringValue("event_link");
        if (str == null) {
            str3 = "";
        }
        TreeJNI treeValue = event.getTreeValue("profile_picture_object", EventInviteesImpl.Event.ProfilePictureObject.class);
        if (treeValue != null) {
            str2 = treeValue.getStringValue("profile_pic_url");
        } else {
            str2 = null;
        }
        return new EventShareInfo(stringValue, str3, this.A04.getUserId(), str2, event.getStringValue(DialogModule.KEY_TITLE), (String) null, (String) null, C18180wK.A1Z(event.getEnumValue("visibility", AnonymousClass220.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), AnonymousClass220.PUBLIC), AnonymousClass0wJ.A1T(event.getBooleanValue("is_link_sharing_enabled") ? 1 : 0, 1), C18180wK.A1Z(event.getEnumValue("viewer_status", AnonymousClass22S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), AnonymousClass22S.OWNER));
    }

    public AnonymousClass10H(EventsRepository eventsRepository, UserSession userSession) {
        this.A04 = userSession;
        EventsRepository eventsRepository2 = eventsRepository;
        this.A00 = eventsRepository2;
        C84714tk A012 = AnonymousClass7J0.A01(new KtSLambdaShape14S0100000_I2_3(16, (C146958n9) null), eventsRepository2.A04);
        C83224qz A002 = AnonymousClass3J5.A00(this);
        C146938n7 r0 = AnonymousClass74I.A01;
        AnonymousClass0ZV r13 = AnonymousClass0ZV.A00;
        this.A03 = C25753DrP.A04(new AnonymousClass1pC((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r13, r13, r13, r13, r13, true, false), A002, A012, r0);
        C27442EnY enY = new C27442EnY();
        this.A01 = enY;
        this.A02 = AnonymousClass7C4.A02(enY);
    }
}
