import io.kloudformation.KloudFormation
import io.kloudformation.StackBuilder
import io.kloudformation.resource.aws.s3.bucket

class Stack: StackBuilder {
    override fun KloudFormation.create() {
        bucket ()
    }
}
