package X;

import com.instagram.api.schemas.ClipsAudioMuteReasonType;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.64V  reason: invalid class name */
public final class AnonymousClass64V extends AnonymousClass5NL implements C21820C1t {
    public final List AdX() {
        return A0D(AnonymousClass8Q3.A00, 1557415452);
    }

    public final ClipsAudioMuteReasonType BBF() {
        return (ClipsAudioMuteReasonType) A09(AnonymousClass8Q4.A00, -880361262);
    }

    public final Boolean AQM() {
        return getOptionalBooleanValueByHashCode(1120317563);
    }

    public final Integer ARy() {
        return getOptionalIntValueByHashCode(-615307517);
    }

    public final String Acu() {
        return A0A(1911060995);
    }

    public final String AjZ() {
        return getStringValueByHashCode(1181455637);
    }

    public final User Ank() {
        return AnonymousClass5NL.A00(this, -383946360);
    }

    public final Integer AzO() {
        return getOptionalIntValueByHashCode(-1532724339);
    }

    public final String B1m() {
        String stringValueByHashCode = getStringValueByHashCode(1873272280);
        if (stringValueByHashCode != null) {
            return stringValueByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final Boolean BB5() {
        return getOptionalBooleanValueByHashCode(930407036);
    }

    public final boolean BBD() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1353604156);
        if (optionalBooleanValueByHashCode != null) {
            return optionalBooleanValueByHashCode.booleanValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String BBE() {
        String stringValueByHashCode = getStringValueByHashCode(-567396441);
        if (stringValueByHashCode != null) {
            return stringValueByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final Integer BIO() {
        return getOptionalIntValueByHashCode(513375630);
    }

    public final Boolean BRs() {
        return getOptionalBooleanValueByHashCode(1033668234);
    }

    public final Boolean BZJ() {
        return getOptionalBooleanValueByHashCode(1915067790);
    }

    public final MusicConsumptionModel D6a(C112176p7 r18) {
        User user;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1120317563);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-615307517);
        String A0A = A0A(1911060995);
        List AdX = AdX();
        String stringValueByHashCode = getStringValueByHashCode(1181455637);
        User A00 = AnonymousClass5NL.A00(this, -383946360);
        if (A00 != null) {
            user = AnonymousClass5NL.A02(r18, A00);
        } else {
            user = null;
        }
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1033668234);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1915067790);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1532724339);
        String B1m = B1m();
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(930407036);
        boolean BBD = BBD();
        return new MusicConsumptionModel(BBF(), user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalIntValueByHashCode, optionalIntValueByHashCode2, getOptionalIntValueByHashCode(513375630), A0A, stringValueByHashCode, B1m, BBE(), AdX, BBD);
    }
}
