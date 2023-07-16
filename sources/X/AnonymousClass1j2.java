package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.1j2  reason: invalid class name */
public abstract class AnonymousClass1j2 extends C685344e implements C85794vm {
    public final C212519q A00;

    public final C62123Xf getCheckpoint() {
        return null;
    }

    public final C571339w getConsentData() {
        return null;
    }

    public final String getErrorMessage() {
        return null;
    }

    public final List getErrorStrings() {
        return null;
    }

    public final List getSystemMessages() {
        return null;
    }

    public final String getCategory() {
        return this.A00.getStringValue("category");
    }

    public final String getCheckpointUrl() {
        return this.A00.getStringValue("checkpoint_url");
    }

    public final String getDialogueType() {
        return this.A00.getStringValue("dialogue_type");
    }

    public final String getEnrollmentTime() {
        return this.A00.getStringValue("enrollment_time");
    }

    public final String getErrorBody() {
        return this.A00.getStringValue("error_body");
    }

    public final String getErrorCode() {
        return this.A00.getStringValue(TraceFieldType.ErrorCode);
    }

    public final String getErrorSource() {
        return this.A00.getStringValue("error_source");
    }

    public final String getErrorTitle() {
        return this.A00.getStringValue("error_title");
    }

    public final String getErrorType() {
        return this.A00.getStringValue("error_type");
    }

    public final String getExpirationTime() {
        return this.A00.getStringValue("expiration_time");
    }

    public final String getFeedbackAction() {
        return this.A00.getStringValue("feedback_action");
    }

    public final String getFeedbackAppealLabel() {
        return this.A00.getStringValue("feedback_appeal_label");
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A00.getStringValue("feedback_ignore_label");
    }

    public final String getFeedbackMessage() {
        return this.A00.getStringValue("feedback_message");
    }

    public final String getFeedbackTitle() {
        return this.A00.getStringValue("feedback_title");
    }

    public final String getFeedbackUrl() {
        return this.A00.getStringValue("feedback_url");
    }

    public final String getLocalizedErrorMessage() {
        return this.A00.getStringValue("localized_error_message");
    }

    public final String getLogoutReason() {
        return this.A00.getStringValue("logout_reason");
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A00.getBooleanValue("news_url_is_regulated");
    }

    public final String getReasonsThrown() {
        return this.A00.getStringValue("reasons_thrown");
    }

    public final String getResponsiblePolicy() {
        return this.A00.getStringValue("responsible_policy");
    }

    public final String getRestrictionDetailUseCase() {
        return this.A00.getStringValue("restriction_detail_use_case");
    }

    public final String getRestrictionExtraData() {
        return this.A00.getStringValue("restriction_extra_data");
    }

    public final String getRestrictionType() {
        return this.A00.getStringValue("restriction_type");
    }

    public final int getRetryCooldownTimeInMs() {
        return this.A00.getIntValue("cooldown_time_in_seconds") * 1000;
    }

    public final boolean getRetryEntireUploadFlow() {
        return this.A00.getBooleanValue("retry_entire_upload_flow");
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A00.getBooleanValue("sentry_block_restriction_dialogue_unification_enabled");
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A00.getBooleanValue("lock");
    }

    public final boolean getSpam() {
        return this.A00.getBooleanValue("is_spam");
    }

    public final String getStatus() {
        String stringValue = this.A00.getStringValue(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }

    public final boolean isCheckpointRequired() {
        return false;
    }

    public final boolean isConsentRequired() {
        return false;
    }

    public final boolean isFeedbackRequired() {
        if (!this.A00.getBooleanValue("feedback_required")) {
            return false;
        }
        return true;
    }

    public final boolean isLoginRequired() {
        return false;
    }

    public AnonymousClass1j2(C212519q r1) {
        this.A00 = r1;
    }

    public final boolean isOk() {
        return C04220Ms.A0I(getStatus(), "ok");
    }
}
