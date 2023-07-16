package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.63V  reason: invalid class name */
public final class AnonymousClass63V extends AnonymousClass5NL implements C41826MeI {
    public final /* synthetic */ LsC AEf() {
        return new LsC(this);
    }

    public final StoryPromptDisablementState AdO() {
        Object A08 = A08(C139248Nf.A00, 186507096);
        if (A08 != null) {
            return (StoryPromptDisablementState) A08;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final List Ah6() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(-1167125638, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                C18180wK.A1U(A0w, it);
            }
            return A0w;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final StoryPromptTappableData D1w(C144028hi r2) {
        return D1v(new C112176p7(r2));
    }

    public final String ASf() {
        return getStringValueByHashCode(2036780306);
    }

    public final Boolean Am6() {
        return getOptionalBooleanValueByHashCode(849767883);
    }

    public final String AuL() {
        return A0A(-900774058);
    }

    public final User Ayy() {
        return AnonymousClass5NL.A00(this, -821815367);
    }

    public final int B07() {
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1324364035);
        if (optionalIntValueByHashCode != null) {
            return optionalIntValueByHashCode.intValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String B4t() {
        return getStringValueByHashCode(-871809258);
    }

    public final String BFt() {
        String A04 = AnonymousClass5NL.A04(this);
        if (A04 != null) {
            return A04;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final Boolean BRm() {
        return getOptionalBooleanValueByHashCode(-1025303767);
    }

    public final Boolean BSI() {
        return getOptionalBooleanValueByHashCode(-1475936846);
    }

    public final Boolean BSd() {
        return getOptionalBooleanValueByHashCode(405415469);
    }

    public final Boolean BUO() {
        return getOptionalBooleanValueByHashCode(1597787285);
    }

    public final Boolean BUm() {
        return getOptionalBooleanValueByHashCode(493270317);
    }

    public final Boolean BWk() {
        return getOptionalBooleanValueByHashCode(1356750754);
    }

    public final Boolean BX6() {
        return getOptionalBooleanValueByHashCode(-1911580874);
    }

    public final Boolean BYf() {
        return getOptionalBooleanValueByHashCode(1233798655);
    }

    public final Boolean BYs() {
        return getOptionalBooleanValueByHashCode(-1114680033);
    }

    public final Boolean BZL() {
        return getOptionalBooleanValueByHashCode(-1996772183);
    }

    public final StoryPromptTappableData D1v(C112176p7 r26) {
        C112176p7 r2;
        User user;
        String stringValueByHashCode = getStringValueByHashCode(2036780306);
        StoryPromptDisablementState AdO = AdO();
        List Ah6 = Ah6();
        ArrayList A0w = AnonymousClass0wJ.A0w(Ah6);
        Iterator it = Ah6.iterator();
        while (true) {
            r2 = r26;
            if (!it.hasNext()) {
                break;
            }
            C18190wL.A1Q(r2, A0w, it);
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(849767883);
        String id = getId();
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1025303767);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-1475936846);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(405415469);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(1597787285);
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(493270317);
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(1356750754);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(-1911580874);
        Boolean optionalBooleanValueByHashCode9 = getOptionalBooleanValueByHashCode(1233798655);
        Boolean optionalBooleanValueByHashCode10 = getOptionalBooleanValueByHashCode(-1114680033);
        Boolean optionalBooleanValueByHashCode11 = getOptionalBooleanValueByHashCode(-1996772183);
        String A0A = A0A(-900774058);
        User A00 = AnonymousClass5NL.A00(this, -821815367);
        if (A00 != null) {
            user = AnonymousClass5NL.A02(r2, A00);
        } else {
            user = null;
        }
        return new StoryPromptTappableData(AdO, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, optionalBooleanValueByHashCode9, optionalBooleanValueByHashCode10, optionalBooleanValueByHashCode11, stringValueByHashCode, id, A0A, getStringValueByHashCode(-871809258), BFt(), A0w, B07());
    }

    public final String getId() {
        String A03 = AnonymousClass5NL.A03(this);
        if (A03 != null) {
            return A03;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
