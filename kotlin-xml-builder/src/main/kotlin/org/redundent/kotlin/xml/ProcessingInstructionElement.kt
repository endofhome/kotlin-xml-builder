package org.redundent.kotlin.xml

/**
 * Similar to a [TextElement] except that the inner text is wrapped inside <??> tag.
 */
class ProcessingInstructionElement internal constructor(text: String) : TextElement(text) {
	override fun render(builder: Appendable, indent: String, printOptions: PrintOptions) {
		if (isEmpty()) {
			return
		}

		val lineEnding = getLineEnding(printOptions)
		builder.append("$indent<?$text?>$lineEnding")
	}
}