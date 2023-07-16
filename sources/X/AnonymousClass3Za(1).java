package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;

/* renamed from: X.3Za  reason: invalid class name */
public final class AnonymousClass3Za {
    public static void A00(MMp mMp, AnonymousClass1j3 r5) {
        if (r5.mSystemMessages != null) {
            mMp.A0U("_messages");
            mMp.A0I();
            for (AnonymousClass37B r2 : r5.mSystemMessages) {
                if (r2 != null) {
                    mMp.A0J();
                    String str = r2.A01;
                    if (str != null) {
                        mMp.A0d("key", str);
                    }
                    Float f = r2.A00;
                    if (f != null) {
                        mMp.A0a("time", f.floatValue());
                    }
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        String str2 = r5.mErrorMessage;
        if (str2 != null) {
            mMp.A0d(DialogModule.KEY_MESSAGE, str2);
        }
        String str3 = r5.mErrorType;
        if (str3 != null) {
            mMp.A0d("error_type", str3);
        }
        String str4 = r5.mErrorSource;
        if (str4 != null) {
            mMp.A0d("error_source", str4);
        }
        String str5 = r5.mErrorTitle;
        if (str5 != null) {
            mMp.A0d("error_title", str5);
        }
        String str6 = r5.mErrorBody;
        if (str6 != null) {
            mMp.A0d("error_body", str6);
        }
        String str7 = r5.mClientFacingErrorMessage;
        if (str7 != null) {
            mMp.A0d("client_facing_error_message", str7);
        }
        mMp.A0e("is_epd_error", r5.mIsEpdError);
        String str8 = r5.mLogoutReason;
        if (str8 != null) {
            mMp.A0d("logout_reason", str8);
        }
        String str9 = r5.mCheckpointUrl;
        if (str9 != null) {
            mMp.A0d("checkpoint_url", str9);
        }
        if (r5.mCheckpoint != null) {
            mMp.A0U("challenge");
            C62123Xf r22 = r5.mCheckpoint;
            mMp.A0J();
            String str10 = r22.A02;
            if (str10 != null) {
                mMp.A0d("url", str10);
            }
            mMp.A0e("lock", r22.A05);
            String str11 = r22.A00;
            if (str11 != null) {
                mMp.A0d("api_path", str11);
            }
            mMp.A0e("hide_webview_header", r22.A03);
            String str12 = r22.A01;
            if (str12 != null) {
                mMp.A0d("challenge_context", str12);
            }
            mMp.A0e("is_dialog", r22.A04);
            mMp.A0G();
        }
        if (r5.mConsentData != null) {
            mMp.A0U("consent_data");
            C571339w r23 = r5.mConsentData;
            mMp.A0J();
            String str13 = r23.A02;
            if (str13 != null) {
                mMp.A0d("headline", str13);
            }
            String str14 = r23.A01;
            if (str14 != null) {
                mMp.A0d("content", str14);
            }
            String str15 = r23.A00;
            if (str15 != null) {
                mMp.A0d("button_text", str15);
            }
            mMp.A0G();
        }
        String str16 = r5.mStatus;
        if (str16 != null) {
            mMp.A0d(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str16);
        }
        mMp.A0e("lock", r5.mLockCheckpointDialog);
        mMp.A0e("feedback_required", r5.mFeedbackRequired);
        String str17 = r5.mFeedbackTitle;
        if (str17 != null) {
            mMp.A0d("feedback_title", str17);
        }
        String str18 = r5.mFeedbackMessage;
        if (str18 != null) {
            mMp.A0d("feedback_message", str18);
        }
        String str19 = r5.mFeedbackAppealLabel;
        if (str19 != null) {
            mMp.A0d("feedback_appeal_label", str19);
        }
        String str20 = r5.mFeedbackIgnoreLabel;
        if (str20 != null) {
            mMp.A0d("feedback_ignore_label", str20);
        }
        String str21 = r5.mFeedbackAction;
        if (str21 != null) {
            mMp.A0d("feedback_action", str21);
        }
        String str22 = r5.mFeedbackUrl;
        if (str22 != null) {
            mMp.A0d("feedback_url", str22);
        }
        Integer num = r5.mRetryCooldownTimeInSec;
        if (num != null) {
            mMp.A0b("cooldown_time_in_seconds", num.intValue());
        }
        String str23 = r5.mLocalizedErrorMessage;
        if (str23 != null) {
            mMp.A0d("localized_error_message", str23);
        }
        mMp.A0e("is_spam", r5.mSpam);
        mMp.A0e("sentry_block_restriction_dialogue_unification_enabled", r5.mSentryBlockRestrictionDialogueUnificationEnabled);
        String str24 = r5.mRestrictionDetailUseCase;
        if (str24 != null) {
            mMp.A0d("restriction_detail_use_case", str24);
        }
        String str25 = r5.mRestrictionType;
        if (str25 != null) {
            mMp.A0d("restriction_type", str25);
        }
        String str26 = r5.mEnrollmentTime;
        if (str26 != null) {
            mMp.A0d("enrollment_time", str26);
        }
        String str27 = r5.mExpirationTime;
        if (str27 != null) {
            mMp.A0d("expiration_time", str27);
        }
        String str28 = r5.mRestrictionExtraData;
        if (str28 != null) {
            mMp.A0d("restriction_extra_data", str28);
        }
        String str29 = r5.mDialogueType;
        if (str29 != null) {
            mMp.A0d("dialogue_type", str29);
        }
        String str30 = r5.mResponsiblePolicy;
        if (str30 != null) {
            mMp.A0d("responsible_policy", str30);
        }
        String str31 = r5.mCategory;
        if (str31 != null) {
            mMp.A0d("category", str31);
        }
        String str32 = r5.mErrorCode;
        if (str32 != null) {
            mMp.A0d(TraceFieldType.ErrorCode, str32);
        }
        String str33 = r5.mReasonsThrown;
        if (str33 != null) {
            mMp.A0d("reasons_thrown", str33);
        }
        Boolean bool = r5.mNewsURLIsRegulated;
        if (bool != null) {
            mMp.A0e("news_url_is_regulated", bool.booleanValue());
        }
        Boolean bool2 = r5.mRetryEntireUploadFlow;
        if (bool2 != null) {
            mMp.A0e("retry_entire_upload_flow", bool2.booleanValue());
        }
    }

    public static boolean A01(MMo mMo, AnonymousClass1j3 r5, String str) {
        ArrayList arrayList = null;
        if ("_messages".equals(str)) {
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = AnonymousClass0wJ.A0v();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    AnonymousClass37B parseFromJson = C32712Cx.parseFromJson(mMo);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            r5.mSystemMessages = arrayList;
            return true;
        } else if (DialogModule.KEY_MESSAGE.equals(str)) {
            r5.parseError(mMo);
            return true;
        } else if ("error_type".equals(str)) {
            r5.mErrorType = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("error_source".equals(str)) {
            r5.mErrorSource = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("error_title".equals(str)) {
            r5.mErrorTitle = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("error_body".equals(str)) {
            r5.mErrorBody = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("client_facing_error_message".equals(str)) {
            r5.mClientFacingErrorMessage = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("is_epd_error".equals(str)) {
            r5.mIsEpdError = mMo.A12();
            return true;
        } else if ("logout_reason".equals(str)) {
            r5.mLogoutReason = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("checkpoint_url".equals(str)) {
            r5.mCheckpointUrl = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("challenge".equals(str)) {
            r5.mCheckpoint = C34652Kj.parseFromJson(mMo);
            return true;
        } else if ("consent_data".equals(str)) {
            r5.mConsentData = C34662Kk.parseFromJson(mMo);
            return true;
        } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(str)) {
            r5.mStatus = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("lock".equals(str)) {
            r5.mLockCheckpointDialog = mMo.A12();
            return true;
        } else if ("feedback_required".equals(str)) {
            r5.mFeedbackRequired = mMo.A12();
            return true;
        } else if ("feedback_title".equals(str)) {
            r5.mFeedbackTitle = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("feedback_message".equals(str)) {
            r5.mFeedbackMessage = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("feedback_appeal_label".equals(str)) {
            r5.mFeedbackAppealLabel = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("feedback_ignore_label".equals(str)) {
            r5.mFeedbackIgnoreLabel = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("feedback_action".equals(str)) {
            r5.mFeedbackAction = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("feedback_url".equals(str)) {
            r5.mFeedbackUrl = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("cooldown_time_in_seconds".equals(str)) {
            r5.mRetryCooldownTimeInSec = C18190wL.A0b(mMo);
            return true;
        } else if ("localized_error_message".equals(str)) {
            r5.mLocalizedErrorMessage = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("is_spam".equals(str)) {
            r5.mSpam = mMo.A12();
            return true;
        } else if ("sentry_block_restriction_dialogue_unification_enabled".equals(str)) {
            r5.mSentryBlockRestrictionDialogueUnificationEnabled = mMo.A12();
            return true;
        } else if ("restriction_detail_use_case".equals(str)) {
            r5.mRestrictionDetailUseCase = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("restriction_type".equals(str)) {
            r5.mRestrictionType = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("enrollment_time".equals(str)) {
            r5.mEnrollmentTime = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("expiration_time".equals(str)) {
            r5.mExpirationTime = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("restriction_extra_data".equals(str)) {
            r5.mRestrictionExtraData = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("dialogue_type".equals(str)) {
            r5.mDialogueType = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("responsible_policy".equals(str)) {
            r5.mResponsiblePolicy = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("category".equals(str)) {
            r5.mCategory = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if (TraceFieldType.ErrorCode.equals(str)) {
            r5.mErrorCode = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("reasons_thrown".equals(str)) {
            r5.mReasonsThrown = AnonymousClass0wJ.A0r(mMo);
            return true;
        } else if ("news_url_is_regulated".equals(str)) {
            r5.mNewsURLIsRegulated = C18180wK.A0Z(mMo);
            return true;
        } else if (!"retry_entire_upload_flow".equals(str)) {
            return false;
        } else {
            r5.mRetryEntireUploadFlow = C18180wK.A0Z(mMo);
            return true;
        }
    }

    public static AnonymousClass1j3 parseFromJson(MMo mMo) {
        return (AnonymousClass1j3) AnonymousClass0wJ.A0f(mMo, 11);
    }
}
