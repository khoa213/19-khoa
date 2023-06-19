const express = require('express');
const router = express.Router();
const outputController = require('../controller/output');
router.post('/datas',outputController.sendData);
router.get('/datas',outputController.getData);
module.exports = router;