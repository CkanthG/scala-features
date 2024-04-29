package functionalprogramming

sealed trait Expr

case class Num(value: Int) extends Expr
case class Add(left: Expr, right: Expr) extends Expr
case class Multiply(left: Expr, right: Expr) extends Expr
