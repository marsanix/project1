import turtle
import colorsys
t = turtle.turtle()
t.speed(500)
turtle.bgcolor("black")
n = 150
h = 0
 for i in ange(500)
 c = colorsys.hsv_to_rgb(h, 1, 0.9)
 h = h +1/n
 t.color(c)
 t.circle(i)
 t.left(10000)