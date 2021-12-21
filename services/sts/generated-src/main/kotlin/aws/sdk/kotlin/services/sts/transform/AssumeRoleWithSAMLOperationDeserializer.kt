// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseRestXmlErrorResponse
import aws.sdk.kotlin.services.sts.model.AssumeRoleWithSamlResponse
import aws.sdk.kotlin.services.sts.model.AssumedRoleUser
import aws.sdk.kotlin.services.sts.model.Credentials
import aws.sdk.kotlin.services.sts.model.StsException
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.DeserializationException
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class AssumeRoleWithSAMLOperationDeserializer: HttpDeserialize<AssumeRoleWithSamlResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): AssumeRoleWithSamlResponse {
        if (!response.status.isSuccess()) {
            throwAssumeRoleWithSamlError(context, response)
        }
        val builder = AssumeRoleWithSamlResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeAssumeRoleWithSAMLOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeAssumeRoleWithSAMLOperationBody(builder: AssumeRoleWithSamlResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)

    val resultDescriptor = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("AssumeRoleWithSAMLResult"))
    val wrapperDescriptor = SdkObjectDescriptor.build {
        trait(XmlSerialName("AssumeRoleWithSAMLResponse"))
        field(resultDescriptor)
    }

    val wrapper = deserializer.deserializeStruct(wrapperDescriptor)
    if (wrapper.findNextFieldIndex() != resultDescriptor.index) {
        throw DeserializationException("failed to unwrap AssumeRoleWithSAML response")
    }

    val ASSUMEDROLEUSER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("AssumedRoleUser"))
    val AUDIENCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Audience"))
    val CREDENTIALS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Credentials"))
    val ISSUER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Issuer"))
    val NAMEQUALIFIER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("NameQualifier"))
    val PACKEDPOLICYSIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("PackedPolicySize"))
    val SOURCEIDENTITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("SourceIdentity"))
    val SUBJECT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Subject"))
    val SUBJECTTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("SubjectType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("https://sts.amazonaws.com/doc/2011-06-15/"))
        trait(XmlSerialName("AssumeRoleWithSAMLResult"))
        field(ASSUMEDROLEUSER_DESCRIPTOR)
        field(AUDIENCE_DESCRIPTOR)
        field(CREDENTIALS_DESCRIPTOR)
        field(ISSUER_DESCRIPTOR)
        field(NAMEQUALIFIER_DESCRIPTOR)
        field(PACKEDPOLICYSIZE_DESCRIPTOR)
        field(SOURCEIDENTITY_DESCRIPTOR)
        field(SUBJECT_DESCRIPTOR)
        field(SUBJECTTYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSUMEDROLEUSER_DESCRIPTOR.index -> builder.assumedRoleUser = deserializeAssumedRoleUserDocument(deserializer)
                AUDIENCE_DESCRIPTOR.index -> builder.audience = deserializeString()
                CREDENTIALS_DESCRIPTOR.index -> builder.credentials = deserializeCredentialsDocument(deserializer)
                ISSUER_DESCRIPTOR.index -> builder.issuer = deserializeString()
                NAMEQUALIFIER_DESCRIPTOR.index -> builder.nameQualifier = deserializeString()
                PACKEDPOLICYSIZE_DESCRIPTOR.index -> builder.packedPolicySize = deserializeInt()
                SOURCEIDENTITY_DESCRIPTOR.index -> builder.sourceIdentity = deserializeString()
                SUBJECT_DESCRIPTOR.index -> builder.subject = deserializeString()
                SUBJECTTYPE_DESCRIPTOR.index -> builder.subjectType = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwAssumeRoleWithSamlError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseRestXmlErrorResponse(payload)
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as awsQuery error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val modeledExceptionDeserializer = when(errorDetails.code) {
        "ExpiredTokenException" -> ExpiredTokenExceptionDeserializer()
        "IDPRejectedClaim" -> IdpRejectedClaimExceptionDeserializer()
        "InvalidIdentityToken" -> InvalidIdentityTokenExceptionDeserializer()
        "MalformedPolicyDocument" -> MalformedPolicyDocumentExceptionDeserializer()
        "PackedPolicyTooLarge" -> PackedPolicyTooLargeExceptionDeserializer()
        "RegionDisabledException" -> RegionDisabledExceptionDeserializer()
        else -> throw StsException(errorDetails.message)
    }

    val modeledException = modeledExceptionDeserializer.deserialize(context, wrappedResponse)
    setAseErrorMetadata(modeledException, wrappedResponse, errorDetails)
    throw modeledException
}
