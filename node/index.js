import express from "express"

const app = express()

const port = 1883

app.get("/", async (req, res) => {
    res.send("API is running")
})

app.listen(port, () => {
    console.log("API is running port:", port);
})