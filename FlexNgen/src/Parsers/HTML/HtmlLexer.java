package Parsers.HTML;

/**
 * Created by devin on 8/21/15.
 */
public class HtmlLexer {
    /*
    * The following is a representation of the State machine that powers this lexer. This is a hacked
    * down version of the original State machine to minimize the 2D arrayb .
    *
    * +===+========+=======+==========+==========+==========+==================+=============+==========+
    * |   | Letter | Digit | <        | >        | /        | Quotation        | White Space | =        |
    * +===+========+=======+==========+==========+==========+==================+=============+==========+
    * | 1 | 1      | 2     | Accept < | Accept > | Accept / | Accept Quotation | Accept WS   | Accept = |
    * +---+--------+-------+----------+----------+----------+------------------+-------------+----------+
    * | 2 | 1      | 1     | Accept   | Accept   | Accept   | Accept           | Accept      | Accept   |
    * +---+--------+-------+----------+----------+----------+------------------+-------------+----------+
    * | 3 | 1      | 2     | Accept   | Accept   | Accept   | Accept           | Accept      | Accept   |
    * +===+========+=======+==========+==========+==========+==================+=============+==========+
    */
}
