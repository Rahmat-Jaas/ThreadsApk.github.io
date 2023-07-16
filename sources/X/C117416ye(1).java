package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ye  reason: invalid class name and case insensitive filesystem */
public final class C117416ye {
    public static AnonymousClass5LG parseFromJson(MMo mMo) {
        return (AnonymousClass5LG) C86104wH.A0d(mMo, 130);
    }

    public static void A00(MMp mMp, AnonymousClass5LG r5) {
        mMp.A0J();
        List list = r5.A08;
        if (list != null) {
            Iterator A0t = C18190wL.A0t(mMp, "answers", list);
            while (A0t.hasNext()) {
                AnonymousClass5LF r2 = (AnonymousClass5LF) A0t.next();
                if (r2 != null) {
                    mMp.A0J();
                    String str = r2.A01;
                    if (str != null) {
                        mMp.A0d("id", str);
                    }
                    String str2 = r2.A02;
                    if (str2 != null) {
                        mMp.A0d("next_id", str2);
                    }
                    Boolean bool = r2.A00;
                    if (bool != null) {
                        mMp.A0e("single_choice_answer", bool.booleanValue());
                    }
                    String str3 = r2.A03;
                    if (str3 != null) {
                        mMp.A0d("text", str3);
                    }
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        String str4 = r5.A02;
        if (str4 != null) {
            mMp.A0d(I17.A00(99), str4);
        }
        String str5 = r5.A03;
        if (str5 != null) {
            mMp.A0d("id", str5);
        }
        String str6 = r5.A04;
        if (str6 != null) {
            mMp.A0d("next_question_id_on_skip", str6);
        }
        String str7 = r5.A05;
        if (str7 != null) {
            mMp.A0d("placeholder", str7);
        }
        Boolean bool2 = r5.A01;
        if (bool2 != null) {
            mMp.A0e("submit_optional", bool2.booleanValue());
        }
        String str8 = r5.A06;
        if (str8 != null) {
            mMp.A0d("submit_text", str8);
        }
        String str9 = r5.A07;
        if (str9 != null) {
            mMp.A0d(DialogModule.KEY_TITLE, str9);
        }
        INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types = r5.A00;
        if (inline_survey_question_types != null) {
            mMp.A0d("type", inline_survey_question_types.A00);
        }
        mMp.A0G();
    }
}
